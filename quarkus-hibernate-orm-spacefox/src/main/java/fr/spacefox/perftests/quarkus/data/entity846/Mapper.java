package fr.spacefox.perftests.quarkus.data.entity846;

import fr.spacefox.perftests.quarkus.core.service846.model.Model846;

final class Mapper {
    private Mapper() {}

    public static Model846 of(Entity846 entity) {
        return new Model846(entity.getId(), entity.getField());
    }
}
