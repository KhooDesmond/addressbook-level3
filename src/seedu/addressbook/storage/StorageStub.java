/**
 * 
 */
package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 *Temporary class used to remove LogicTest dependency on StorageFile
 */
public class StorageStub implements Storage {

    public StorageStub(String path) {
        
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // does nothing
    }

    @Override
    public AddressBook load() throws StorageOperationException {     
        return null;
    }


    @Override
    public String getPath() {
        return null;
    }

}
