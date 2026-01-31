package fr.spacefox.perftests.quarkus.data.entity656;

import fr.spacefox.perftests.quarkus.core.service656.model.Model656;

final class Mapper {
    private Mapper() {}

    public static Model656 of(Entity656 entity) {
        return new Model656(entity.getId(), entity.getField());
    }
}
