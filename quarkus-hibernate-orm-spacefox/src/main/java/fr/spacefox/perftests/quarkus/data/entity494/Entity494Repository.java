package fr.spacefox.perftests.quarkus.data.entity494;

import fr.spacefox.perftests.quarkus.core.port.data.Entity494DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service494.model.Model494;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity494Repository implements Entity494DatasourcePort, PanacheRepository<Entity494> {
    @Override
    public Optional<Model494> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
