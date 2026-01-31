package fr.spacefox.perftests.quarkus.data.entity851;

import fr.spacefox.perftests.quarkus.core.service851.model.Model851;

final class Mapper {
    private Mapper() {}

    public static Model851 of(Entity851 entity) {
        return new Model851(entity.getId(), entity.getField());
    }
}
