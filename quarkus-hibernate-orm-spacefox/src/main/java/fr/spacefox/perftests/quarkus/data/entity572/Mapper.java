package fr.spacefox.perftests.quarkus.data.entity572;

import fr.spacefox.perftests.quarkus.core.service572.model.Model572;

final class Mapper {
    private Mapper() {}

    public static Model572 of(Entity572 entity) {
        return new Model572(entity.getId(), entity.getField());
    }
}
