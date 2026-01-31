package fr.spacefox.perftests.quarkus.data.entity337;

import fr.spacefox.perftests.quarkus.core.port.data.Entity337DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service337.model.Model337;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity337Repository implements Entity337DatasourcePort, PanacheRepository<Entity337> {
    @Override
    public Optional<Model337> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
