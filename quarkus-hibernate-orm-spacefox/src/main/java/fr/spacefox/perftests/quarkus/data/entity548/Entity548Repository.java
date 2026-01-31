package fr.spacefox.perftests.quarkus.data.entity548;

import fr.spacefox.perftests.quarkus.core.port.data.Entity548DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service548.model.Model548;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity548Repository implements Entity548DatasourcePort, PanacheRepository<Entity548> {
    @Override
    public Optional<Model548> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
