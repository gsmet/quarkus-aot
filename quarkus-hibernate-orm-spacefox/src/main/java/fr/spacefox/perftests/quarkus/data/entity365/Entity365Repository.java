package fr.spacefox.perftests.quarkus.data.entity365;

import fr.spacefox.perftests.quarkus.core.port.data.Entity365DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service365.model.Model365;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity365Repository implements Entity365DatasourcePort, PanacheRepository<Entity365> {
    @Override
    public Optional<Model365> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
