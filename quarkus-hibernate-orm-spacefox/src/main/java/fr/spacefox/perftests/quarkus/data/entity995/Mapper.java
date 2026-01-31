package fr.spacefox.perftests.quarkus.data.entity995;

import fr.spacefox.perftests.quarkus.core.service995.model.Model995;

final class Mapper {
    private Mapper() {}

    public static Model995 of(Entity995 entity) {
        return new Model995(entity.getId(), entity.getField());
    }
}
