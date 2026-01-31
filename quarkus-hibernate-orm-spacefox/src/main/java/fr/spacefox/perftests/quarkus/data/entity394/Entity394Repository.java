package fr.spacefox.perftests.quarkus.data.entity394;

import fr.spacefox.perftests.quarkus.core.port.data.Entity394DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service394.model.Model394;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity394Repository implements Entity394DatasourcePort, PanacheRepository<Entity394> {
    @Override
    public Optional<Model394> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
