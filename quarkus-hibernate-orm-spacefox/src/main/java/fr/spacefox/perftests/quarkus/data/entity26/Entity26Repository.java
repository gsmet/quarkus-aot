package fr.spacefox.perftests.quarkus.data.entity26;

import fr.spacefox.perftests.quarkus.core.port.data.Entity26DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service26.model.Model26;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity26Repository implements Entity26DatasourcePort, PanacheRepository<Entity26> {
    @Override
    public Optional<Model26> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
