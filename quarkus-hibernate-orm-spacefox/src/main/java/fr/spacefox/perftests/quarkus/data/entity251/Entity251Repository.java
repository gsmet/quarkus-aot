package fr.spacefox.perftests.quarkus.data.entity251;

import fr.spacefox.perftests.quarkus.core.port.data.Entity251DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service251.model.Model251;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity251Repository implements Entity251DatasourcePort, PanacheRepository<Entity251> {
    @Override
    public Optional<Model251> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
