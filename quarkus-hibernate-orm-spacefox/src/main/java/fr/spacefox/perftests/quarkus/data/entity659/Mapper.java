package fr.spacefox.perftests.quarkus.data.entity659;

import fr.spacefox.perftests.quarkus.core.service659.model.Model659;

final class Mapper {
    private Mapper() {}

    public static Model659 of(Entity659 entity) {
        return new Model659(entity.getId(), entity.getField());
    }
}
