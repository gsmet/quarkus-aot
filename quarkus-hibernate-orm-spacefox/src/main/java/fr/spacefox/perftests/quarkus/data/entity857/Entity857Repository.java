package fr.spacefox.perftests.quarkus.data.entity857;

import fr.spacefox.perftests.quarkus.core.port.data.Entity857DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service857.model.Model857;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity857Repository implements Entity857DatasourcePort, PanacheRepository<Entity857> {
    @Override
    public Optional<Model857> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
