package impl;

import spec.Contact;

/**
 * Implementation of the Contact interface.
 * <p/>
 * This class does not ensure that ID's are unique, and therefore has a dependency on another class to
 * ensure that IDs provided to this are unique.
 * <p/>
 * ContactManagerImpl ensures IDs provided to this are unique.
 * <p/>
 * Several assumptions have been made in the creation of this class:
 * <ul>
 * <li>Adding notes when notes already exist will, if the current notes and new string is nonempty, append these
 * with a space in the middle. Adding empty spaces will be appended in the same way. This has no impact for use
 * within ContactManager as there is no way of altering notes once a Contact is created.</li>
 * <li>Nulls are allowed to be entered for name and notes. It has not been specified to throw any exceptions. The
 * class ContactManager deals with nulls and empty strings.</li>
 * <li>Empty names and notes can be stored.</li>
 * </ul>
 */

public class ContactImpl implements Contact {

    /**
     * Creates a Contact. Name and Notes can be null. ID should be ensured that it is unique before it is passed into this method.
     *
     * @param id    the ID for the contact
     * @param name  the name of the contact
     * @param notes the notes about the contact
     */

    public ContactImpl(int id, String name, String notes) {
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getNotes() {
        return null;
    }

    /**
     * {@inheritDoc}
     * <p/>
     * If the note parameter is null, no changes to notes shall be made.
     * <p/>
     * Otherwise, adding notes when notes already exist will append the new notes to the old notes, with a space in between.
     */

    @Override
    public void addNotes(String note) {
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
