package fr.spacefox.perftests.quarkus.core.service188;

import fr.spacefox.perftests.quarkus.core.port.data.Entity188DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service188.model.Model188;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service188 {

    private final Entity188DatasourcePort datasource;

    public Service188(Entity188DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model188 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
