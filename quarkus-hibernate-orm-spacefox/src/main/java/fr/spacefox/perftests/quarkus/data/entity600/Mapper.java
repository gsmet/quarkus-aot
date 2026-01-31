package fr.spacefox.perftests.quarkus.data.entity600;

import fr.spacefox.perftests.quarkus.core.service600.model.Model600;

final class Mapper {
    private Mapper() {}

    public static Model600 of(Entity600 entity) {
        return new Model600(entity.getId(), entity.getField());
    }
}
