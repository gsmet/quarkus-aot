package fr.spacefox.perftests.quarkus.data.entity310;

import fr.spacefox.perftests.quarkus.core.port.data.Entity310DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service310.model.Model310;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity310Repository implements Entity310DatasourcePort, PanacheRepository<Entity310> {
    @Override
    public Optional<Model310> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
