package fr.spacefox.perftests.quarkus.data.entity708;

import fr.spacefox.perftests.quarkus.core.service708.model.Model708;

final class Mapper {
    private Mapper() {}

    public static Model708 of(Entity708 entity) {
        return new Model708(entity.getId(), entity.getField());
    }
}
