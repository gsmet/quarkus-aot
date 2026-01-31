package fr.spacefox.perftests.quarkus.data.entity852;

import fr.spacefox.perftests.quarkus.core.service852.model.Model852;

final class Mapper {
    private Mapper() {}

    public static Model852 of(Entity852 entity) {
        return new Model852(entity.getId(), entity.getField());
    }
}
