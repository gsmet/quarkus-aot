package fr.spacefox.perftests.quarkus.data.entity260;

import fr.spacefox.perftests.quarkus.core.port.data.Entity260DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service260.model.Model260;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity260Repository implements Entity260DatasourcePort, PanacheRepository<Entity260> {
    @Override
    public Optional<Model260> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
