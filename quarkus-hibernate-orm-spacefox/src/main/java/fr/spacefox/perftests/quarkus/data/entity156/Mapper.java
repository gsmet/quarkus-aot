package fr.spacefox.perftests.quarkus.data.entity156;

import fr.spacefox.perftests.quarkus.core.service156.model.Model156;

final class Mapper {
    private Mapper() {}

    public static Model156 of(Entity156 entity) {
        return new Model156(entity.getId(), entity.getField());
    }
}
