package fr.spacefox.perftests.quarkus.data.entity966;

import fr.spacefox.perftests.quarkus.core.port.data.Entity966DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service966.model.Model966;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity966Repository implements Entity966DatasourcePort, PanacheRepository<Entity966> {
    @Override
    public Optional<Model966> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
