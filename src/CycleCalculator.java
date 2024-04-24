import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

public class CycleCalculator {

    private JFrame frame;
    private JTextField output;
    private JDateChooser periodStartDateChooser;
    private JDateChooser targetDateChooser;
    public static JButton pPicture;
    public static ImageIcon period1;
    public static ImageIcon period2;
    public static ImageIcon period3;
    public static ImageIcon period4;
    public static ImageIcon period5;
    public static ImageIcon period6;
    public static ImageIcon period7;
    public static ImageIcon period8;
    public static ImageIcon period9;
    public static ImageIcon period10;
    public static ImageIcon period11;
    public static ImageIcon period12;
    public static ImageIcon period13;
    public static ImageIcon period14;
    public static ImageIcon period15;
    public static ImageIcon period16;
    public static ImageIcon period17;
    public static ImageIcon period18;
    public static ImageIcon period19;
    public static ImageIcon period20;
    public static ImageIcon period21;
    public static ImageIcon period22;
    public static ImageIcon period23;
    public static ImageIcon period24;
    public static ImageIcon period25;
    public static ImageIcon period26;
    public static ImageIcon period27;
    public static ImageIcon period28;
    public static ImageIcon[] periodIcons = new ImageIcon[28];

    public static void main(String[] args) {
    	
    	period1 = new ImageIcon("cycleImages/period1.png");
    	period2 = new ImageIcon("cycleImages/period2.png");
    	period3 = new ImageIcon("cycleImages/period3.png");
    	period4 = new ImageIcon("cycleImages/period4.png");
    	period5 = new ImageIcon("cycleImages/period5.png");
    	period6 = new ImageIcon("cycleImages/period6.png");
    	period7 = new ImageIcon("cycleImages/period7.png");
    	period8 = new ImageIcon("cycleImages/period8.png");
    	period9 = new ImageIcon("cycleImages/period9.png");
    	period10 = new ImageIcon("cycleImages/period10.png");
    	period11 = new ImageIcon("cycleImages/period11.png");
    	period12 = new ImageIcon("cycleImages/period12.png");
    	period13 = new ImageIcon("cycleImages/period13.png");
    	period14 = new ImageIcon("cycleImages/period14.png");
    	period15 = new ImageIcon("cycleImages/period15.png");
    	period16 = new ImageIcon("cycleImages/period16.png");
    	period17 = new ImageIcon("cycleImages/period17.png");
    	period18 = new ImageIcon("cycleImages/period18.png");
    	period19 = new ImageIcon("cycleImages/period19.png");
    	period20 = new ImageIcon("cycleImages/period20.png");
    	period21 = new ImageIcon("cycleImages/period21.png");
    	period22 = new ImageIcon("cycleImages/period22.png");
    	period23 = new ImageIcon("cycleImages/period23.png");
    	period24 = new ImageIcon("cycleImages/period24.png");
    	period25 = new ImageIcon("cycleImages/period25.png");
    	period26 = new ImageIcon("cycleImages/period26.png");
    	period27 = new ImageIcon("cycleImages/period27.png");
    	period28 = new ImageIcon("cycleImages/period28.png");
    	
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CycleCalculator window = new CycleCalculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CycleCalculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1334, 856);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Menstrual Cycle Calculator");
        lblNewLabel.setBounds(10, 11, 1283, 48);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 40));
        frame.getContentPane().add(lblNewLabel);

        // Create a JDateChooser for the period start date
        periodStartDateChooser = new JDateChooser();
        periodStartDateChooser.setBounds(307, 211, 161, 37);
        frame.getContentPane().add(periodStartDateChooser);

        // Create a JDateChooser for the target date
        targetDateChooser = new JDateChooser();
        targetDateChooser.setBounds(307, 288, 161, 37);
        frame.getContentPane().add(targetDateChooser);

        output = new JTextField();
        output.setHorizontalAlignment(SwingConstants.CENTER);
        output.setFont(new Font("Lucida Bright", Font.PLAIN, 22));
        output.setBounds(10, 422, 544, 94);
        frame.getContentPane().add(output);
        output.setColumns(10);

        JButton btnNewButton = new JButton("Calculate");
        btnNewButton.setFont(new Font("Javanese Text", Font.PLAIN, 25));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateCycle(periodStartDateChooser.getDate(), targetDateChooser.getDate());
                
            }
        });
        btnNewButton.setBounds(28, 348, 148, 48);
        frame.getContentPane().add(btnNewButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Javanese Text", Font.PLAIN, 27));
        
        pPicture = new JButton("");
        pPicture.setBounds(581, 154, 681, 458);
        frame.getContentPane().add(pPicture);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                periodStartDateChooser.setDate(null);
                targetDateChooser.setDate(null);
                output.setText(null);
                pPicture.setIcon(null);
                
            }
        });
        clearButton.setBounds(285, 541, 148, 48);
        frame.getContentPane().add(clearButton);
        
        JLabel lblNewLabel_1 = new JLabel("Menstrual Start Date");
        lblNewLabel_1.setFont(new Font("Javanese Text", Font.PLAIN, 28));
        lblNewLabel_1.setBounds(28, 211, 257, 37);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Blood Draw Date");
        lblNewLabel_1_1.setFont(new Font("Javanese Text", Font.PLAIN, 28));
        lblNewLabel_1_1.setBounds(28, 288, 224, 37);
        frame.getContentPane().add(lblNewLabel_1_1);
 
    }

    private void calculateCycle(java.util.Date periodStartDate, java.util.Date targetDate) {
        if (periodStartDate == null || targetDate == null) {
            output.setText("Please select valid dates.");
            return;
        }

        LocalDate periodStart = periodStartDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate target = targetDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        long daysAgo = ChronoUnit.DAYS.between(periodStart, target);
        
        for (int i = 0; i < periodIcons.length; i++) {
            periodIcons[i] = new ImageIcon("period" + (i + 1) + ".png");
        }

        
        
        if (daysAgo < 1) {
            output.setText("Blood draw must be before cycle started");
            pPicture.setIcon(null);}
       
        if(daysAgo>28) {
        	output.setText("Cycle length is longer than average 28 day period");
        	pPicture.setIcon(null);
        }
        
        else {
        	
        	
        pPicture.setIcon(periodIcons[(int)daysAgo - 1]);
        if (daysAgo < 7) {
            output.setText("Period phase");
        } 
        else if (daysAgo >= 7 && daysAgo < 14) {
            output.setText("Follicular phase");
        } else {
            output.setText("Luteal phase");
        }
        
      
        }
    }
    
    
}
