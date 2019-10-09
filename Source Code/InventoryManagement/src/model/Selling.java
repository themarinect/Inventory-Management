
package model;
import gui.frmSalesManager;
import interact.DataInteraction;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
/**
 *
 * @author  manara
 */
public class Selling extends ApplicationFrame {
    frmSalesManager  sm;
    public Selling(final String title) throws SQLException {

        super(title);
        
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
        setDefaultCloseOperation(ApplicationFrame.EXIT_ON_CLOSE);
    }
   private CategoryDataset createDataset() throws SQLException {
       int row=sm.tblItems.getSelectedRow();
       String id=(String) sm.tblItems.getValueAt(0,row);
       String sql="select Sold,convert(char(10),DateImport,101) as Date,ItemID from Items where ItemID='"+id+"' and DATEDIFF(MM,DateImport, GETDATE())=1";
        ResultSet rs=DataInteraction.queryResultSet(sql);
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        while(rs.next())
        dataset.addValue(rs.getInt("Sold"), "Nhom 1", "Project");
        return dataset;

    }

    private JFreeChart createChart(final CategoryDataset dataset) {
        
        final JFreeChart chart = ChartFactory.createBarChart3D(
            "Selling in the last one month",      // chart title
            "Date Selling",               // domain axis label
            "Sold",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );

        final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 8.0)
        );
        
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true);
        final BarRenderer r = (BarRenderer) renderer;
        r.setMaxBarWidth(0.05);
        
        return chart;

    }
    /*public static void main(final String[] args) {

    final LuocDo4 demo = new LuocDo4("Sales-trend graphs for each of the item");
    demo.pack();
    RefineryUtilities.centerFrameOnScreen(demo);
    demo.setVisible(true);

    }*/

}
