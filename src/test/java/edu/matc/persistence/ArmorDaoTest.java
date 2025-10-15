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


}
