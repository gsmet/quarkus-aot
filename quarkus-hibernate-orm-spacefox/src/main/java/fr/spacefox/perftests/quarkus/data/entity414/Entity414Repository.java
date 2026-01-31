package fr.spacefox.perftests.quarkus.data.entity414;

import fr.spacefox.perftests.quarkus.core.port.data.Entity414DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service414.model.Model414;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity414Repository implements Entity414DatasourcePort, PanacheRepository<Entity414> {
    @Override
    public Optional<Model414> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
