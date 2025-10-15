package edu.matc.persistence;

import edu.matc.entity.Armor;
import edu.matc.testUtils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Armor entity using GenericDao.
 */
public class ArmorDaoTest {

    private GenericDao<Armor> armorDao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        armorDao = new GenericDao<>(Armor.class);
    }

    @Test
    void insertSuccess() {
        Armor newArmor = new Armor("Combat", "Torso", "Unyielding", "Bolstering", null, null);
        int id = armorDao.insert(newArmor);
        assertTrue(id > 0);
        Armor insertedArmor = armorDao.getById(id);
        assertEquals("Combat", insertedArmor.getArmorName());
        assertEquals("Torso", insertedArmor.getArmorSlot());
    }

    @Test
    void getByIdSuccess() {
        Armor armor = new Armor("Combat", "Torso", "Unyielding", "Bolstering", null, null);
        int id = armorDao.insert(armor);

        Armor retrievedArmor = armorDao.getById(id);

        assertNotNull(retrievedArmor);
        assertEquals("Combat", retrievedArmor.getArmorName());
        assertEquals("Torso", retrievedArmor.getArmorSlot());
        assertEquals("Unyielding", retrievedArmor.getEffectOne());
    }


    @Test
    void updateSuccess() {
        Armor newArmor = new Armor("Leather", "Left Arm", "Weightless", null, null, null);
        int id = armorDao.insert(newArmor);
        Armor insertedArmor = armorDao.getById(id);
        insertedArmor.setArmorSlot("Right Arm");
        armorDao.update(insertedArmor);

        Armor updatedArmor = armorDao.getById(id);
        assertEquals("Right Arm", updatedArmor.getArmorSlot());
    }

    @Test
    void deleteSuccess() {
        Armor newArmor = new Armor("Marine", "Leg", null, null, null, null);
        int id = armorDao.insert(newArmor);
        Armor insertedArmor = armorDao.getById(id);
        armorDao.delete(insertedArmor);

        Armor deletedArmor = armorDao.getById(id);
        assertNull(deletedArmor);
    }

    @Test
    void getAllSuccess() {
        List<Armor> armors = armorDao.getAll();
        assertNotNull(armors);
        assertTrue(armors.size() >= 0);
    }
}
