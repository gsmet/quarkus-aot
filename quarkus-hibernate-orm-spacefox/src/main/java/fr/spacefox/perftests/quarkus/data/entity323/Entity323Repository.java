package fr.spacefox.perftests.quarkus.data.entity323;

import fr.spacefox.perftests.quarkus.core.port.data.Entity323DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service323.model.Model323;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity323Repository implements Entity323DatasourcePort, PanacheRepository<Entity323> {
    @Override
    public Optional<Model323> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
