package fr.spacefox.perftests.quarkus.data.entity478;

import fr.spacefox.perftests.quarkus.core.service478.model.Model478;

final class Mapper {
    private Mapper() {}

    public static Model478 of(Entity478 entity) {
        return new Model478(entity.getId(), entity.getField());
    }
}
