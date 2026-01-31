package fr.spacefox.perftests.quarkus.data.entity313;

import fr.spacefox.perftests.quarkus.core.port.data.Entity313DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service313.model.Model313;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity313Repository implements Entity313DatasourcePort, PanacheRepository<Entity313> {
    @Override
    public Optional<Model313> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
