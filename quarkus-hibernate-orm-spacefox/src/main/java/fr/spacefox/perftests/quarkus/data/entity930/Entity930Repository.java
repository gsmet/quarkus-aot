package fr.spacefox.perftests.quarkus.data.entity930;

import fr.spacefox.perftests.quarkus.core.port.data.Entity930DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service930.model.Model930;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity930Repository implements Entity930DatasourcePort, PanacheRepository<Entity930> {
    @Override
    public Optional<Model930> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
