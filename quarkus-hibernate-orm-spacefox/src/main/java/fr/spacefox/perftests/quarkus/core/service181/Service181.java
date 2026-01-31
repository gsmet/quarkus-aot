package fr.spacefox.perftests.quarkus.core.service181;

import fr.spacefox.perftests.quarkus.core.port.data.Entity181DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service181.model.Model181;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service181 {

    private final Entity181DatasourcePort datasource;

    public Service181(Entity181DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model181 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
