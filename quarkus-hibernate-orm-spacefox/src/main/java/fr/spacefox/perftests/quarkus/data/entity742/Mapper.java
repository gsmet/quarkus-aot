package fr.spacefox.perftests.quarkus.data.entity742;

import fr.spacefox.perftests.quarkus.core.service742.model.Model742;

final class Mapper {
    private Mapper() {}

    public static Model742 of(Entity742 entity) {
        return new Model742(entity.getId(), entity.getField());
    }
}
