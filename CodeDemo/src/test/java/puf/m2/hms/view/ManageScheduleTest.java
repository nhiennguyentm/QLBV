package puf.m2.hms.view;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

public class ManageScheduleTest {

	@Test
	public void testIsValidFields_blankStartDate() {
		ManageSchedule frm = new ManageSchedule();
		Date startDate = frm.getTxtStartDate().getDate();
		Assert.assertEquals("You must put a valid start date",
				frm.checkValidField());
	}

	@Test
	public void testIsValidFields_blankEndDate() {
		ManageSchedule frm = new ManageSchedule();
		@SuppressWarnings("deprecation")
		Date startDate = new Date(2012, 02, 02);
		frm.getTxtStartDate().setDate(startDate);

		Assert.assertEquals("You must put a valid end date",
				frm.checkValidField());
	}

	@Test
	public void testIsValidFields_invalidStartDate_EndDate() {
		ManageSchedule frm = new ManageSchedule();
		@SuppressWarnings("deprecation")
		Date startDate = new Date(2012, 02, 02);
		@SuppressWarnings("deprecation")
		Date endDate = new Date(2011, 02, 02);
		frm.getTxtStartDate().setDate(startDate);
		frm.getTxtEndDate().setDate(endDate);
		Assert.assertEquals("Start date must be ealier than end date",
				frm.checkValidField());
	}
}
