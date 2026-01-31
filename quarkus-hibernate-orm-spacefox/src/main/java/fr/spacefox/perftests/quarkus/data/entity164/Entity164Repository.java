package fr.spacefox.perftests.quarkus.data.entity164;

import fr.spacefox.perftests.quarkus.core.port.data.Entity164DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service164.model.Model164;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity164Repository implements Entity164DatasourcePort, PanacheRepository<Entity164> {
    @Override
    public Optional<Model164> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
