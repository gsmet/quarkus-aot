package fr.spacefox.perftests.quarkus.data.entity879;

import fr.spacefox.perftests.quarkus.core.port.data.Entity879DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service879.model.Model879;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity879Repository implements Entity879DatasourcePort, PanacheRepository<Entity879> {
    @Override
    public Optional<Model879> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
