package fr.spacefox.perftests.quarkus.data.entity195;

import fr.spacefox.perftests.quarkus.core.service195.model.Model195;

final class Mapper {
    private Mapper() {}

    public static Model195 of(Entity195 entity) {
        return new Model195(entity.getId(), entity.getField());
    }
}
