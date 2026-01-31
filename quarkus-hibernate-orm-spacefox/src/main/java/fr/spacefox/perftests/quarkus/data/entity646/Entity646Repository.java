package fr.spacefox.perftests.quarkus.data.entity646;

import fr.spacefox.perftests.quarkus.core.port.data.Entity646DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service646.model.Model646;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity646Repository implements Entity646DatasourcePort, PanacheRepository<Entity646> {
    @Override
    public Optional<Model646> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
