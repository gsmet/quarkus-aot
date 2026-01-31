package fr.spacefox.perftests.quarkus.data.entity398;

import fr.spacefox.perftests.quarkus.core.port.data.Entity398DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service398.model.Model398;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity398Repository implements Entity398DatasourcePort, PanacheRepository<Entity398> {
    @Override
    public Optional<Model398> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
