package fr.spacefox.perftests.quarkus.data.entity221;

import fr.spacefox.perftests.quarkus.core.port.data.Entity221DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service221.model.Model221;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity221Repository implements Entity221DatasourcePort, PanacheRepository<Entity221> {
    @Override
    public Optional<Model221> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
