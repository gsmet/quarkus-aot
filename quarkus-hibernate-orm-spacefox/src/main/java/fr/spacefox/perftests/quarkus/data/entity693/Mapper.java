package fr.spacefox.perftests.quarkus.data.entity693;

import fr.spacefox.perftests.quarkus.core.service693.model.Model693;

final class Mapper {
    private Mapper() {}

    public static Model693 of(Entity693 entity) {
        return new Model693(entity.getId(), entity.getField());
    }
}
