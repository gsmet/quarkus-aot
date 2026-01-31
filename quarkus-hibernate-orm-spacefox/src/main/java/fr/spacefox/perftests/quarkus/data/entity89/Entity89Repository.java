package fr.spacefox.perftests.quarkus.data.entity89;

import fr.spacefox.perftests.quarkus.core.port.data.Entity89DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service89.model.Model89;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity89Repository implements Entity89DatasourcePort, PanacheRepository<Entity89> {
    @Override
    public Optional<Model89> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
