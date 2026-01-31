package fr.spacefox.perftests.quarkus.data.entity837;

import fr.spacefox.perftests.quarkus.core.service837.model.Model837;

final class Mapper {
    private Mapper() {}

    public static Model837 of(Entity837 entity) {
        return new Model837(entity.getId(), entity.getField());
    }
}
