package fr.spacefox.perftests.quarkus.data.entity756;

import fr.spacefox.perftests.quarkus.core.service756.model.Model756;

final class Mapper {
    private Mapper() {}

    public static Model756 of(Entity756 entity) {
        return new Model756(entity.getId(), entity.getField());
    }
}
