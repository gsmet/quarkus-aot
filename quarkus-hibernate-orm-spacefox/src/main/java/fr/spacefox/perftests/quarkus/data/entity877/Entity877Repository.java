package fr.spacefox.perftests.quarkus.data.entity877;

import fr.spacefox.perftests.quarkus.core.port.data.Entity877DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service877.model.Model877;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity877Repository implements Entity877DatasourcePort, PanacheRepository<Entity877> {
    @Override
    public Optional<Model877> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
