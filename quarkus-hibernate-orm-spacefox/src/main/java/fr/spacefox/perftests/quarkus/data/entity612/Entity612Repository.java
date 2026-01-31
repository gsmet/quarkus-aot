package fr.spacefox.perftests.quarkus.data.entity612;

import fr.spacefox.perftests.quarkus.core.port.data.Entity612DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service612.model.Model612;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity612Repository implements Entity612DatasourcePort, PanacheRepository<Entity612> {
    @Override
    public Optional<Model612> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
