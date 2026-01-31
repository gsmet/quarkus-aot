package fr.spacefox.perftests.quarkus.core.service922;

import fr.spacefox.perftests.quarkus.core.port.data.Entity922DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service922.model.Model922;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service922 {

    private final Entity922DatasourcePort datasource;

    public Service922(Entity922DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model922 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
