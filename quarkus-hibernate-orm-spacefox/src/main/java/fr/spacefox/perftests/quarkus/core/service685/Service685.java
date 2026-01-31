package fr.spacefox.perftests.quarkus.core.service685;

import fr.spacefox.perftests.quarkus.core.port.data.Entity685DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service685.model.Model685;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service685 {

    private final Entity685DatasourcePort datasource;

    public Service685(Entity685DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model685 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
