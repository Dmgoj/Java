package si.um.opj.grgic.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.Box;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Component;
import si.feri.opj.grgic.Data.Discipline;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.CardLayout;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenu;
import com.toedter.components.JSpinField;
import javax.swing.JSpinner;
import javax.swing.SpringLayout;

public class GUI {

	private JFrame frame;
	private JTextField venueName;
	private JTextField venuePhone;
	private JTextField venueCapacity;
	private JTextField eventName;
	private JTextField eventSchedule;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 932, 665);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane);
		
		JPanel Venue = new JPanel();
		Venue.setToolTipText("Venue");
		tabbedPane.addTab("Venue", null, Venue, null);
		Venue.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Create Venue", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		Venue.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_6.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Name");
		panel_3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		venueName = new JTextField();
		panel_3.add(venueName);
		venueName.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_6.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Phone Number");
		panel_4.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		venuePhone = new JTextField();
		panel_4.add(venuePhone);
		venuePhone.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_6.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Capacity");
		panel_5.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		venueCapacity = new JTextField();
		panel_5.add(venueCapacity);
		venueCapacity.setColumns(10);
		
		JPanel panel_22 = new JPanel();
		panel_6.add(panel_22);
		panel_22.setLayout(new GridLayout(0, 2, 0, 0));
		
		JComboBox venueDiscipline = new JComboBox();
		venueDiscipline.setModel(new DefaultComboBoxModel(Discipline.values()));
		venueDiscipline.setToolTipText("Discipline");
		panel_22.add(venueDiscipline);
		
		JPanel panel_20 = new JPanel();
		panel_6.add(panel_20);
		panel_20.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton addHall = new JRadioButton("Hall");
		buttonGroup_1.add(addHall);
		panel_20.add(addHall);
		
		JRadioButton addStadium = new JRadioButton("Stadium");
		buttonGroup_1.add(addStadium);
		panel_20.add(addStadium);
		
		JPanel panel_21 = new JPanel();
		panel_6.add(panel_21);
		panel_21.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Additional Halls");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_21.add(lblNewLabel_7);
		
		JSpinner spinner = new JSpinner();
		panel_21.add(spinner);
		
		JButton venueSubmit = new JButton("Submit");
		panel_6.add(venueSubmit);
		
		JList venueListHall = new JList();
		venueListHall.setBorder(new TitledBorder(null, "Halls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(venueListHall);
		
		JList venueListStadium = new JList();
		venueListStadium.setBorder(new TitledBorder(null, "Stadium", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.add(venueListStadium);
		
		JPanel panel_19 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_19.getLayout();
		panel_2.add(panel_19);
		
		JButton editVenue = new JButton("Edit");
		panel_19.add(editVenue);
		
		JButton deleteVenue = new JButton("Delete");
		panel_19.add(deleteVenue);
		venueSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(venueName.getText());
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Matches", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Venue.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JList venueMatchesList = new JList();
		panel_1.add(venueMatchesList);
		
		JPanel panel_23 = new JPanel();
		panel_1.add(panel_23);
		
		JButton venuaAddMatch = new JButton("Add");
		panel_23.add(venuaAddMatch);
		
		JButton venueDeleteMatch = new JButton("Delete");
		panel_23.add(venueDeleteMatch);
		
		JPanel Event = new JPanel();
		tabbedPane.addTab("Event", null, Event, null);
		Event.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, "Create Event", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Event.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_12.add(panel_13);
		panel_13.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_13.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_7.add(lblNewLabel_3);
		
		eventName = new JTextField();
		lblNewLabel_3.setLabelFor(eventName);
		panel_7.add(eventName);
		eventName.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_13.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel Schedule = new JLabel("Schedule");
		panel_8.add(Schedule);
		
		eventSchedule = new JTextField();
		Schedule.setLabelFor(eventSchedule);
		panel_8.add(eventSchedule);
		eventSchedule.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_13.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton eventCancelled = new JRadioButton("Cancelled");
		panel_9.add(eventCancelled);
		buttonGroup.add(eventCancelled);
		
		JRadioButton eventHappening = new JRadioButton("Happening");
		panel_9.add(eventHappening);
		buttonGroup.add(eventHappening);
		
		JComboBox venueType = new JComboBox();
		venueType.setModel(new DefaultComboBoxModel(new String[] {"training", "match"}));
		venueType.setToolTipText("Type");
		panel_13.add(venueType);
		
		JButton eventSubmit = new JButton("Submit");
		panel_13.add(eventSubmit);
		
		JList eventTrainingList = new JList();
		eventTrainingList.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Trainings", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_12.add(eventTrainingList);
		
		JPanel panel_16 = new JPanel();
		panel_12.add(panel_16);
		
		JButton editEvent = new JButton("Edit");
		editEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_16.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_16.add(editEvent);
		
		JButton deleteEvent = new JButton("Delete");
		panel_16.add(deleteEvent);
		
		JPanel panel_15 = new JPanel();
		Event.add(panel_15);
		panel_15.setLayout(new CardLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_15.add(panel_10, "name_649886216918500");
		panel_10.setBorder(new TitledBorder(null, "Athletes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setLayout(new GridLayout(0, 1, 0, 0));
		
		JList eventAthleteList = new JList();
		panel_10.add(eventAthleteList);
		
		JPanel panel = new JPanel();
		panel_10.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton eventAddAthlete = new JButton("Add");
		panel.add(eventAddAthlete);
		
		JButton eventDeleteAthlete = new JButton("Delete");
		panel.add(eventDeleteAthlete);
		
		JButton changePanelMatches = new JButton("Matches");
				panel.add(changePanelMatches);
		
		JPanel panel_11 = new JPanel();
		panel_15.add(panel_11, "name_649886230519700");
		panel_11.setBorder(new TitledBorder(null, "Matches", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		
		JList eventMatchesList = new JList();
		panel_11.add(eventMatchesList);
		
		JPanel panel_24 = new JPanel();
		panel_11.add(panel_24);
		
		JButton eventAddMatch = new JButton("Add");
		panel_24.add(eventAddMatch);
		
		JButton eventDeleteMatch = new JButton("Delete");
		panel_24.add(eventDeleteMatch);
		
		JButton changePanelAthletes = new JButton("Athletes");
		panel_24.add(changePanelAthletes);
		changePanelAthletes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_11.hide();
				panel_10.show();
			}
		});
		
		JPanel Athlete = new JPanel();
		Athlete.setBorder(new TitledBorder(null, "Add Athlete", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Athlete.setToolTipText("Athlete");
		tabbedPane.addTab("Athlete", null, Athlete, null);
		Athlete.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_14 = new JPanel();
		Athlete.add(panel_14);
		panel_14.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel firstnamelabel = new JLabel("Firstname");
		firstnamelabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(firstnamelabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_14.add(textField);
		
		JLabel surnamelabel = new JLabel("Surname");
		surnamelabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(surnamelabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_14.add(textField_1);
		
		JLabel lblNewLabel_6 = new JLabel("Athlete number");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_14.add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("Discipline");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_4);
		
		JComboBox discipline = new JComboBox();
		discipline.setModel(new DefaultComboBoxModel(Discipline.values()));
		discipline.setToolTipText("DISCIPLINE");
		panel_14.add(discipline);
		
		JLabel lblNewLabel_5 = new JLabel("Date of birth");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_5);
		
		JDateChooser athleteDob = new JDateChooser();
		athleteDob.setDateFormatString("yyyy. MM. dd.");
		panel_14.add(athleteDob);
		
		JButton athleteSubmit = new JButton("Submit");
		panel_14.add(athleteSubmit);
		
		JPanel panel_17 = new JPanel();
		Athlete.add(panel_17);
		panel_17.setLayout(new GridLayout(2, 1, 0, 0));
		
		JList athleteList = new JList();
		panel_17.add(athleteList);
		
		JPanel panel_18 = new JPanel();
		panel_17.add(panel_18);
		
		JButton editAthlete = new JButton("Edit");
		panel_18.add(editAthlete);
		
		JButton deleteAthlete = new JButton("Delete");
		panel_18.add(deleteAthlete);
		
		changePanelMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_10.hide();
				panel_11.show();
			}
		});

	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
}
