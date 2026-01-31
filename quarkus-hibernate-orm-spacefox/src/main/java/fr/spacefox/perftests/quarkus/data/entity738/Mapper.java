package fr.spacefox.perftests.quarkus.data.entity738;

import fr.spacefox.perftests.quarkus.core.service738.model.Model738;

final class Mapper {
    private Mapper() {}

    public static Model738 of(Entity738 entity) {
        return new Model738(entity.getId(), entity.getField());
    }
}
