package fr.spacefox.perftests.quarkus.data.entity188;

import fr.spacefox.perftests.quarkus.core.port.data.Entity188DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service188.model.Model188;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity188Repository implements Entity188DatasourcePort, PanacheRepository<Entity188> {
    @Override
    public Optional<Model188> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
