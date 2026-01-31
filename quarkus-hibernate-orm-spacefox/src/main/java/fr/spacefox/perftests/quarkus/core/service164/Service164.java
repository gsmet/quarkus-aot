package fr.spacefox.perftests.quarkus.core.service164;

import fr.spacefox.perftests.quarkus.core.port.data.Entity164DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service164.model.Model164;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service164 {

    private final Entity164DatasourcePort datasource;

    public Service164(Entity164DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model164 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
