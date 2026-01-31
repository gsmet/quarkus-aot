package fr.spacefox.perftests.quarkus.data.entity816;

import fr.spacefox.perftests.quarkus.core.service816.model.Model816;

final class Mapper {
    private Mapper() {}

    public static Model816 of(Entity816 entity) {
        return new Model816(entity.getId(), entity.getField());
    }
}
